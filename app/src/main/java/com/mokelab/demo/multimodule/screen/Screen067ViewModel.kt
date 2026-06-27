package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data661RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data662RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data663RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data664RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data665RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data666RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data667RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data668RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data669RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data670RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen067ViewModel @Inject constructor(
    private val repo1: Data661RepositoryImpl,
    private val repo2: Data662RepositoryImpl,
    private val repo3: Data663RepositoryImpl,
    private val repo4: Data664RepositoryImpl,
    private val repo5: Data665RepositoryImpl,
    private val repo6: Data666RepositoryImpl,
    private val repo7: Data667RepositoryImpl,
    private val repo8: Data668RepositoryImpl,
    private val repo9: Data669RepositoryImpl,
    private val repo10: Data670RepositoryImpl,

): ViewModel() {
}
