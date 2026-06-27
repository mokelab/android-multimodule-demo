package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data301RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data302RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data303RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data304RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data305RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data306RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data307RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data308RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data309RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data310RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen031ViewModel @Inject constructor(
    private val repo1: Data301RepositoryImpl,
    private val repo2: Data302RepositoryImpl,
    private val repo3: Data303RepositoryImpl,
    private val repo4: Data304RepositoryImpl,
    private val repo5: Data305RepositoryImpl,
    private val repo6: Data306RepositoryImpl,
    private val repo7: Data307RepositoryImpl,
    private val repo8: Data308RepositoryImpl,
    private val repo9: Data309RepositoryImpl,
    private val repo10: Data310RepositoryImpl,

): ViewModel() {
}
