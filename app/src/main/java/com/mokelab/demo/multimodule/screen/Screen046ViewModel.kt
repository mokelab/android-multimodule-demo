package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data451RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data452RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data453RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data454RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data455RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data456RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data457RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data458RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data459RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data460RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen046ViewModel @Inject constructor(
    private val repo1: Data451RepositoryImpl,
    private val repo2: Data452RepositoryImpl,
    private val repo3: Data453RepositoryImpl,
    private val repo4: Data454RepositoryImpl,
    private val repo5: Data455RepositoryImpl,
    private val repo6: Data456RepositoryImpl,
    private val repo7: Data457RepositoryImpl,
    private val repo8: Data458RepositoryImpl,
    private val repo9: Data459RepositoryImpl,
    private val repo10: Data460RepositoryImpl,

): ViewModel() {
}
